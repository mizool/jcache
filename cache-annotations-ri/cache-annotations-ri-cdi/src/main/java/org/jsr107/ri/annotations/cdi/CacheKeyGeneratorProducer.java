/**
 *  Copyright 2011-2013 Terracotta, Inc.
 *  Copyright 2011-2013 Oracle America Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jsr107.ri.annotations.cdi;

import javax.cache.annotation.CacheKeyGenerator;
import javax.enterprise.inject.Produces;

import org.jsr107.ri.annotations.DefaultCacheKeyGenerator;

/**
 * Producer for the default {@link javax.cache.annotation.CacheKeyGenerator}.
 *
 * @author Sven Haberer
 * @since 1.0.0-injectability-improvement
 */
public class CacheKeyGeneratorProducer {
  /**
   * Produces a new instance of the {@link org.jsr107.ri.annotations.DefaultCacheKeyGenerator}.
   *
   * @return A new instance of the {@link org.jsr107.ri.annotations.DefaultCacheKeyGenerator}.
   */
  @Produces
  public CacheKeyGenerator produce() {
    return new DefaultCacheKeyGenerator();
  }
}
