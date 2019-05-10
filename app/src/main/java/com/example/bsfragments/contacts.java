package com.example.bsfragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

public class contacts extends Fragment {
    private MapView mapview;
    private final String MAPKIT_API_KEY = "7944a636-4992-4f4f-90e2-5cbdde8bf9a9";
    private final Point TARGET_LOCATION = new Point(43.255312, 76.947213);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }

    @Override
    public void onStop() {
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
        super.onStop();
    }

    @Override
    public void onStart() {
        super.onStart();
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
        MapKitFactory.initialize(getActivity());
        mapview = (MapView)getView().findViewById(R.id.map);
        mapview.getMap().move(
                new CameraPosition(TARGET_LOCATION, 14.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 5),
                null);
        MapKitFactory.getInstance().onStart();
        mapview.onStart();
    }
}
