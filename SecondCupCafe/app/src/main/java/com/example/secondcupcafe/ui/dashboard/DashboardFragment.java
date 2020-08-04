package com.example.secondcupcafe.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.secondcupcafe.CoffeeMenu;
import com.example.secondcupcafe.Hot_Menu;
import com.example.secondcupcafe.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                            ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dashboard,container,false);
     CardView card,card2;
        CardView card3,card4;

        card = v.findViewById(R.id.coffeecard);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CoffeeMenu.class);
                getActivity().startActivity(intent);
            }
        });
        card4 = v.findViewById(R.id.hotcard);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Hot_Menu.class);
                getActivity().startActivity(intent);
            }
        });

      /*  card2 = v.findViewById(R.id.breakcard);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Breakfastv2.class);
                getActivity().startActivity(intent);
            }
        });
        card3 = v.findViewById(R.id.coldcard);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ColdBev.class);
                getActivity().startActivity(intent);
            }
        });


*/
        return v;}

    }

