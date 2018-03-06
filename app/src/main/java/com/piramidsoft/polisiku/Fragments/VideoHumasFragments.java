package com.piramidsoft.polisiku.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.piramidsoft.polisiku.Adapter.VideoAdapter;
import com.piramidsoft.polisiku.Model.ModelVideo;
import com.piramidsoft.polisiku.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class VideoHumasFragments extends Fragment {

    @BindView(R.id.RvVideo)
    RecyclerView RvVideo;
    Unbinder unbinder;
    ArrayList<ModelVideo> arrayList = new ArrayList<>();
    VideoAdapter adapter;

    public VideoHumasFragments() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.video_humas_fragments, container, false);
        unbinder = ButterKnife.bind(this, view);

        dataku();

        RvVideo.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1,
                GridLayoutManager.VERTICAL, false);
        RvVideo.setLayoutManager(layoutManager);

        adapter = new VideoAdapter(arrayList, getActivity());
        RvVideo.setAdapter(adapter);

        return view;
    }

    private void dataku() {
        arrayList.add(new ModelVideo(R.drawable.mopol, "DIDUGA PELAKOR TETANGGA", "Bang Rudi", "Tentang Pelakor Hitz", "10:00 12/12/2018","x10k"));
        arrayList.add(new ModelVideo(R.drawable.mopol, "DIDUGA PELAKOR TETANGGA", "Bang Rudi", "Tentang Pelakor Hitz", "10:00 12/12/2018","x10k"));
        arrayList.add(new ModelVideo(R.drawable.mopol, "DIDUGA PELAKOR TETANGGA", "Bang Rudi", "Tentang Pelakor Hitz", "10:00 12/12/2018","x10k"));
        arrayList.add(new ModelVideo(R.drawable.mopol, "DIDUGA PELAKOR TETANGGA", "Bang Rudi", "Tentang Pelakor Hitz", "10:00 12/12/2018","x10k"));
        arrayList.add(new ModelVideo(R.drawable.mopol, "DIDUGA PELAKOR TETANGGA", "Bang Rudi", "Tentang Pelakor Hitz", "10:00 12/12/2018","x10k"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
