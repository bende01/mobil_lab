package com.example.spotify_api.Model.Room;



import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(
        entities = {PlaylistItem.class},
        version = 1
)

public abstract class PlaylistDatabase extends RoomDatabase {
    public abstract PlaylistItemDao playlistItemDao();
}