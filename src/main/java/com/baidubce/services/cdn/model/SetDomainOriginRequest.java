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

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;

/**
 * @author yixing
 *
 */
public class SetDomainOriginRequest extends AbstractBceRequest {
    
    private List<OriginPeer> origin;
    private String domain;
    
    /**
     * @return domain
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * @param domain the domain name
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * @return origin
     */
    public List<OriginPeer> getOrigin() {
        return origin;
    }
    
    /**
     * @param origin
     */
    public void setOrigin(List<OriginPeer> origin) {
        this.origin = origin;
    }
    
    /**
     * @param domain the domain name
     * @return returns this object
     */
    public SetDomainOriginRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }
    
    /**
     * @param origin
     * @return returns this object
     */
    public SetDomainOriginRequest withOrigin(List<OriginPeer> origin) {
        setOrigin(origin);
        return this;
    }
    
    /**
     * (non-Javadoc)
     * @see com.baidubce.model.AbstractBceRequest#withRequestCredentials(com.baidubce.auth.BceCredentials)
     */
    @Override
    public SetDomainOriginRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
    
    /**
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        try {
            return JsonUtils.toJsonPrettyString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}