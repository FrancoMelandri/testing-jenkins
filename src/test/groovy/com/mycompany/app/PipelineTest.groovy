package com.mycompany.app;

import com.lesfurets.jenkins.unit.BasePipelineTest
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import org.junit.Before
import org.junit.Test

class PipelineTest extends PipelineTestHelper {

    def sut

    @Override
    @Before
    void setUp () throws Exception {
        super.setUp()

        sut = loadScript("vars/module.groovy")
        sut.constants = loadScript("vars/constants.groovy")
        sut.logger = loadScript("src/test/mock/logger.groovy")
        sut.logger.initialize()
    }

    @Test
    void shouldCallPrepareLog() throws Exception {
        sut.call()
    }
}
