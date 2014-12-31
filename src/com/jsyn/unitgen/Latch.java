/*
 * Copyright 1997 Phil Burk, Mobileer Inc
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

import com.jsyn.ports.UnitInputPort;

/**
 * Latch or hold an input value.
 * <P>
 * Pass a value unchanged if gate true, otherwise output held value.
 * <P>
 * output = ( gate > 0.0 ) ? input : previous_output;
 * 
 * @author (C) 1997-2010 Phil Burk, Mobileer Inc
 * @see EdgeDetector
 */
public class Latch extends UnitFilter {
    public UnitInputPort gate;
    private double held;

    /* Define Unit Ports used by connect() and set(). */
    public Latch() {
        addPort(gate = new UnitInputPort("Gate"));
    }

    @Override
    public void generate(int start, int limit) {
        double[] inputs = input.getValues();
        double[] gates = gate.getValues();
        double[] outputs = output.getValues();

        for (int i = start; i < limit; i++) {
            if (gates[i] > 0.0) {
                held = inputs[i];
            }
            outputs[i] = held;
        }
    }
}
