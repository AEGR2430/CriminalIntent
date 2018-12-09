package com.adriangutierrez.android.criminalintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected void Fragment crimeFragment() {
        return new CrimeFragment();
    }
}
