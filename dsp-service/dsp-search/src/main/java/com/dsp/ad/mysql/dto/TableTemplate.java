package com.dsp.ad.mysql.dto;

import com.dsp.ad.mysql.constant.OpType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 44644
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableTemplate {

    private String tableName;

    private String level;

    private Map<OpType, List<String>> opTypeFieldSetMap = new HashMap<>();

    /**
     * 字段索引 -> 字段名
     */
    private Map<Integer, String> posMap = new HashMap<>();

}






















