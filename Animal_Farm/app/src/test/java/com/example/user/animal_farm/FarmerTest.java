package com.example.user.animal_farm;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 20/12/2016.
 */
public class FarmerTest {

    private Cow daisy;
    private Farmer farmer;

    @Before
    public void Before()    {
        farmer = new Farmer();
        daisy = new Cow("Daisy", "Cow", 5);

    }


}
