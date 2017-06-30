/*
 * Copyright 2016 Baidu, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.baidubce.services.cdn.model;

/**
 * @author yixing
 *
 */
public class PvRegionData extends JsonObject {

    private String location;
    private String isp;
    private Long pv;
    private Long qps;
    
    /**
     * @return location
     */
    public String getLocation() {
        return location;
    }
    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * @return isp
     */
    public String getIsp() {
        return isp;
    }
    /**
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }
    /**
     * @return pv
     */
    public Long getPv() {
        return pv;
    }
    /**
     * @param pv
     */
    public void setPv(Long pv) {
        this.pv = pv;
    }
    /**
     * @return qps
     */
    public Long getQps() {
        return qps;
    }
    /**
     * @param qps
     */
    public void setQps(Long qps) {
        this.qps = qps;
    }
}
