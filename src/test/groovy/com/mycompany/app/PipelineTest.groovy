package com.mycompany.app;

import com.lesfurets.jenkins.unit.BasePipelineTest
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import org.junit.Before
import org.junit.Test;

class PipelineTest extends BasePipelineTest {

    @Override
    @Before
    void setUp () throws Exception {
        super.setUp()
    }

    @Test
    void shouldAnswerWithTrue() throws Exception {
        def pipelineScript = loadScript("src/main/groovy/com/mycompany/app/Pipeline.groovy")
        pipelineScript.execute()
        assertEquals(helper.callStack.filter { call ->
            callArgsToString(call).contains("Hello World!")
            }.count(), 1)
    }
}
