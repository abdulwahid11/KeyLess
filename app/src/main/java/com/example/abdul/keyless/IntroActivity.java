package com.example.abdul.keyless;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.example.abdul.keyless.Fragments.IntroFragment1;
import com.example.abdul.keyless.Fragments.IntroFragment2;
import com.example.abdul.keyless.Fragments.IntroFragment3;
import com.github.paolorotolo.appintro.AppIntro;

/**
 * Created by HP on 10/23/2016.
 */
public class IntroActivity extends AppIntro {
    // Please DO NOT override onCreate. Use init
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IntroFragment1 frag1=new IntroFragment1();
        IntroFragment2 frag2= new IntroFragment2();
        IntroFragment3 frag3=new IntroFragment3();
        addSlide(frag1);
        addSlide(frag2);
        addSlide(frag3);

        showSkipButton(false);
        setProgressButtonEnabled(true);
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Toast.makeText(this, "done", Toast.LENGTH_SHORT).show();
        // Do something when users tap on Done button.
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}