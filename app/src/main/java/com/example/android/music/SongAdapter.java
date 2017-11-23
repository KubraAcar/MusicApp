package com.example.android.music;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songList) {
        super(context, 0, songList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);
//Burası için gerekli olan pozisyonu döncek..
        TextView textViewOne = (TextView) listItemView.findViewById(R.id.name);
        TextView textViewTwo = (TextView) listItemView.findViewById(R.id.song_name);
        TextView textViewThree = (TextView) listItemView.findViewById(R.id.duration);

        textViewOne.setText(currentSong.getName());
        textViewTwo.setText(currentSong.getSingerName());
        textViewThree.setText(currentSong.getDuration());

          /* //Bu imageview de 2satırdan birinin image inin görünmez yaptık..
        ImageView img=(ImageView) listItemView.findViewById (R.id.play_image_view);
        if(position%2!=0)
        {
            img.setVisibility(View.INVISIBLE);
        }
*/
        return listItemView;
    }

}


