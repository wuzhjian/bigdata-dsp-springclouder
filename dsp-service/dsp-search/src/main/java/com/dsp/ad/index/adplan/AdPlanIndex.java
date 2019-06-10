package com.dsp.ad.index.adplan;

import com.dsp.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 44644
 */
@Slf4j
@Component
public class AdPlanIndex implements IndexAware<Long, AdPlanObject> {

    private static Map<Long, AdPlanObject> objectMap;

    static {
        objectMap = new ConcurrentHashMap<>();
    }
    @Override
    public AdPlanObject get(Long key) {
        return null;
    }

    @Override
    public void add(Long key, AdPlanObject value) {

    }

    @Override
    public void update(Long key, AdPlanObject value) {

    }

    @Override
    public void delete(Long key, AdPlanObject value) {

    }
}
