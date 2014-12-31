/*
 * Copyright 2009 Phil Burk, Mobileer Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jsyn.unitgen;

import com.jsyn.ports.UnitOutputPort;

/**
 * Interface for things that have that have an output and an associated UnitGenerator.
 * 
 * @author Phil Burk, (C) 2009 Mobileer Inc
 */
public interface UnitSource {
    public UnitOutputPort getOutput();

    public UnitGenerator getUnitGenerator();
}
