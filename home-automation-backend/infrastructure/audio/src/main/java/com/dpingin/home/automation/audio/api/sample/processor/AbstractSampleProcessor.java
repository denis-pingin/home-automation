package com.dpingin.home.automation.audio.api.sample.processor;

import com.dpingin.home.automation.audio.api.pattern.control.Controls;
import com.dpingin.home.automation.audio.api.sample.processor.output.AbstractSampleProcessorOutput;
import com.dpingin.home.automation.audio.api.sample.processor.SampleProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: DanoSaur
 * Date: 27.09.14
 * Time: 00:21
 * To change this template use File | Settings | File Templates.
 */
public class AbstractSampleProcessor<T extends AbstractSampleProcessorOutput> implements SampleProcessor
{
    protected Controls controls;

    @Override
    public void setControls(Controls controls)
    {
        this.controls = controls;
    }

    @Override
    public T processSamples(float[] samples, float sampleRate)
    {
        return null;
    }
}
