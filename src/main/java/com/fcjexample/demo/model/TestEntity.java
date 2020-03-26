/*************************************************************************
 *
 * Copyright (c) 2016, DATAVISOR, INC.
 * All rights reserved.
 * __________________
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of DataVisor, Inc.
 * The intellectual and technical concepts contained
 * herein are proprietary to DataVisor, Inc. and
 * may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from DataVisor, Inc.
 */

package com.fcjexample.demo.model;

import java.util.HashMap;
import java.util.Map;

public class TestEntity {

    Integer id;
    String name;
    Long createTime;
    private Map<Integer, TestEntity> subTestEntitys = new HashMap<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Map<Integer, TestEntity> getSubTestEntitys() {
        return subTestEntitys;
    }

    public void setSubTestEntitys(
            Map<Integer, TestEntity> subTestEntitys) {
        this.subTestEntitys = subTestEntitys;
    }

    @Override public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", subTestEntitys=" + subTestEntitys +
                '}';
    }
}