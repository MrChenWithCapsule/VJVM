package com.mcwcapsule.VJVM.interpreter.instruction.loads;

import com.mcwcapsule.VJVM.interpreter.instruction.Instruction;
import com.mcwcapsule.VJVM.runtime.JThread;
import lombok.val;

public class LOAD2S extends Instruction {

    @Override
    public void fetchAndRun(JThread thread) {
        val frame = thread.getCurrentFrame();
        frame.getOpStack().pushLong(frame.getLocalVars().getLong(thread.getPC().getUnsignedByte()));
    }

}
