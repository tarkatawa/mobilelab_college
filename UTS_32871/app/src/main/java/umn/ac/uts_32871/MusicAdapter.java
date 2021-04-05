package umn.ac.uts_32871;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.SiViewHolder> {

    private ArrayList<MusicFiles> siFiles;
    private Context siContext;

    MusicAdapter(Context siContext, ArrayList<MusicFiles> siFiles){
        this.siFiles = siFiles;
        this.siContext = siContext;
    }

    @NonNull
    @Override
    public SiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(siContext).inflate(R.layout.music_items, parent, false);
        return new SiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SiViewHolder holder, int position) {
        holder.file_name.setText(siFiles.get(position).getTitle());
        byte[] image = getAlbumArt(siFiles.get(position).getPath());
        if (image != null){
            Glide.with(siContext).asBitmap().load(image).into(holder.album_art);
        }
        else {
            Glide.with(siContext).load(R.drawable.annie).into(holder.album_art);
        }
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(siContext, PlayerActivity.class);
            intent.putExtra("position",position);
            siContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return siFiles.size();
    }

    public class SiViewHolder extends RecyclerView.ViewHolder{
        TextView file_name;
        ImageView album_art;
        public SiViewHolder(@NonNull View itemView) {
            super(itemView);
            file_name = itemView.findViewById(R.id.music_file_name);
            album_art = itemView.findViewById(R.id.music_img);
        }
    }
    private byte [] getAlbumArt(String uri){
        MediaMetadataRetriever ambil = new MediaMetadataRetriever();
        ambil.setDataSource(uri);
        byte[] art = ambil.getEmbeddedPicture();
        ambil.release();
        return art;
    }
}


