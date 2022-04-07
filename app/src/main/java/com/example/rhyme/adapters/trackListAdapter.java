package com.example.rhyme.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rhyme.R;
import com.example.rhyme.databinding.FragmentTrackListScrollingBinding;
import com.example.rhyme.models.Track;
import com.example.rhyme.models.topTrack;

import java.util.List;

public class trackListAdapter extends RecyclerView.Adapter<trackListAdapter.trackViewHolder>{
private List <topTrack>trackList;
    private Context context;
    private FragmentTrackListScrollingBinding trackBinding;
    private tracklistener listener;
    private Fragment lyricfragment;
public interface tracklistener{
    void onItemClick(topTrack track);
}
    public trackListAdapter(List<topTrack> trackList, Context context,tracklistener listener) {
        this.trackList = trackList;
        this.context = context;
        this.listener=listener;
    }

    @NonNull
    @Override
    public trackListAdapter.trackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_track_list_scrolling,parent,false);
        return new trackViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull trackListAdapter.trackViewHolder holder, int position) {
        topTrack track=trackList.get(position);
        holder.artistName.setText(track.getArtistName());
        holder.trackName.setText(track.getTrackName());
holder.Bind(track,listener);
    }

    @Override
    public int getItemCount() {
        return trackList.size();
    }
    public static class trackViewHolder extends RecyclerView.ViewHolder{
        private TextView artistName;
        private TextView trackName;
        public trackViewHolder(@NonNull View itemView) {
            super(itemView);
            artistName=itemView.findViewById(R.id.trackartist);
            trackName=itemView.findViewById(R.id.trackname);

        }
        public void Bind (topTrack track,tracklistener listener){
itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        listener.onItemClick(track);

//        replaceFragment(lyricfragment)
    }
});
        }
    }
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = fragment.getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentlyrics,fragment);
        fragmentTransaction.commit();

    }
}
