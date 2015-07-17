package com.mobilemakers.robolectricmockito;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java_cup.Main;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@Config(constants = BuildConfig.class, emulateSdk = 21)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {

    @Test
    public void testValidateTextViewContent() throws Exception {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        TextView tvHelloWorld = (TextView) activity.findViewById(R.id.helloworld);
        assertNotNull("TextView could not be found", tvHelloWorld);
        assertTrue("TextView contains incorrect text",
                "Hello world!".equals(tvHelloWorld.getText().toString()));
    }
}