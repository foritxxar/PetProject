package edu.valenciacollege.austinconcepcion.petproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class SearchSettingsFragment extends Fragment {

    View fragmentView;
    private EditText priceLowET, priceHighET;
    private ImageButton dateButton, locationButton;
    private HorizontalScrollView petHSV;
    private LinearLayout imageList;
    private Pets[] myPets;
    private ImageButton[] petButtons;


    public SearchSettingsFragment() {    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search_settings, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        findViews();
        createSamplePets();

    }

    public void findViews(){
        fragmentView = getView();
        priceLowET = fragmentView.findViewById(R.id.price_low_et);
        priceHighET = fragmentView.findViewById(R.id.price_high_et);
        petHSV = fragmentView.findViewById(R.id.pet_selector_scroll);
        imageList = fragmentView.findViewById(R.id.image_list);
    }
    public void createSamplePets(){
        myPets = new Pets[3];
        Pets shae = new Pets(0, 0, 2, false, "Shae","ic_sample_pet_shae_round");
        Pets atlas = new Pets(1, 3, 1, false, "Atlas","ic_sample_pet_atlas_round");
        Pets newton = new Pets(2, 3, 0, false, "Newton","ic_sample_pet_newton_round");
        myPets[0] = shae;
        myPets[1] = atlas;
        myPets[2] = newton;
    }

    public void displayList(){

        petButtons = new ImageButton[myPets.length];
        for(int i = 0; i < myPets.length; i++){
            petButtons[i] = new ImageButton(fragmentView.getContext());
            int resId = fragmentView.getResources().getIdentifier(
                    myPets[i].getImageName(), "drawable", (fragmentView.getContext().getPackageName()));
            petButtons[i].setImageResource((resId));
        }
    }

}
