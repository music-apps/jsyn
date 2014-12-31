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

package com.jsyn.ports;

import com.jsyn.data.Function;

/**
 * Port for holding a Function object.
 * 
 * @author Phil Burk (C) 2009 Mobileer Inc
 */
public class UnitFunctionPort extends UnitPort {
    private static NullFunction nullFunction = new NullFunction();
    private Function function = nullFunction;

    private static class NullFunction implements Function {
        @Override
        public double evaluate(double input) {
            return 0.0;
        }
    }

    public UnitFunctionPort(String name) {
        super(name);
    }

    public void set(Function function) {
        this.function = function;
    }

    public Function get() {
        return function;
    }
}
