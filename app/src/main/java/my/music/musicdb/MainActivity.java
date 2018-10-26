package my.music.musicdb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import my.music.musicdb.UI.CRUD.AlbumActivity;
import my.music.musicdb.UI.CRUD.ArtistActivity;
import my.music.musicdb.UI.CRUD.SongActivity;
import my.music.musicdb.UI.show.AlbumsActivity;
import my.music.musicdb.UI.show.ArtistsActivity;
import my.music.musicdb.UI.show.GenresActivity;
import my.music.musicdb.UI.show.SongsActivity;

public class MainActivity extends AppCompatActivity {

    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setIcon(R.drawable.logo);
        TextView tw_albums = (TextView)findViewById(R.id.allAlbums);
        TextView tw_artists = (TextView)findViewById(R.id.allArtists);
        TextView tw_songs = (TextView)findViewById(R.id.allSongs);
        TextView tw_genres = (TextView)findViewById(R.id.allGenres);
        tw_albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, my.music.musicdb.UI.show.AlbumsActivity.class));
            }
        });
        tw_artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, my.music.musicdb.UI.show.ArtistsActivity.class));
            }
        });
        tw_songs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, my.music.musicdb.UI.show.SongsActivity.class));
            }
        });
        tw_genres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, my.music.musicdb.UI.show.GenresActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        Intent intent;
        switch (item.getItemId()) {
            case R.id.add_album:
                intent = new Intent(this, AlbumActivity.class);
                this.startActivity(intent);
                return true;
            case R.id.add_artist:
                intent = new Intent(this, ArtistActivity.class);
                this.startActivity(intent);
                return true;
            case R.id.add_song:
                intent = new Intent(this, SongActivity.class);
                this.startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}