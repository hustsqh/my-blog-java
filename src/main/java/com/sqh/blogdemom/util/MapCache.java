package com.sqh.blogdemom.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapCache {
    private static final int DEFAULT_CACHES = 1024;
    private static final MapCache INS = new MapCache();

    public static MapCache single() {
        return INS;
    }

    private Map<String, CacheObject> cachePool;

    public MapCache() {
        this(DEFAULT_CACHES);
    }

    public MapCache(int cacheCount) {
        cachePool = new ConcurrentHashMap<>(cacheCount);
    }

    public <T> T get(String key) {
        CacheObject cacheObject = cachePool.get(key);
        if (cacheObject != null) {
            long cur = System.currentTimeMillis() / 1000;
            if (cacheObject.expired <= 0 || cacheObject.expired > cur) {
                Object result = cacheObject.value;
                return (T) result;
            }
            if (cur > cacheObject.expired) {
                cachePool.remove(key);
            }
        }
        return null;
    }

    public <T> T hget(String key, String field) {
        key = key + ":" + field;
        return this.get(key);
    }

    public void set(String key, Object value) {
        this.set(key, value, -1);
    }

    public void set(String key, Object value, long expired) {
        expired = expired > 0 ? System.currentTimeMillis() / 1000 + expired : expired;
        if (cachePool.size() > 800) {
            cachePool.clear();
        }
        CacheObject cacheObject = new CacheObject(key, value, expired);
        cachePool.put(key, cacheObject);
    }

    public void hset(String key, String field, Object value) {
        this.hset(key, field, value, -1);
    }

    public void hset(String key, String field, Object value, long expired) {
        key = key + ":" + field;
        expired = expired > 0 ? System.currentTimeMillis() / 1000 + expired : expired;
        CacheObject cacheObject = new CacheObject(key, value, expired);
        cachePool.put(key, cacheObject);
    }

    public void del(String key) {
        cachePool.remove(key);
    }

    public void hdel(String key, String field) {
        key = key + ":" + field;
        this.del(key);
    }
    
    public void clear(){
        cachePool.clear();
    }

    static class CacheObject {
        private String key;
        private Object value;
        private long expired;

        public CacheObject(String key, Object value, long expired) {
            this.key = key;
            this.value = value;
            this.expired = expired;
        }

        public String getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public long getExpired() {
            return expired;
        }
    }
}
