package my.music.musicdb.UI.show;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import my.music.musicdb.MainActivity;
import my.music.musicdb.R;
import my.music.musicdb.UI.show.AlbumsActivity;
import my.music.musicdb.UI.show.ArtistsActivity;
import my.music.musicdb.UI.show.SongsActivity;

public class GenresActivity extends AppCompatActivity {

    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genres);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setIcon(R.drawable.logo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_genres, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.go_home:
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                return true;
            case R.id.add_artist:
                intent = new Intent(this, my.music.musicdb.UI.CRUD.ArtistActivity.class);
                this.startActivity(intent);
                return true;
            case R.id.add_album:
                intent = new Intent(this, my.music.musicdb.UI.CRUD.AlbumActivity.class);
                this.startActivity(intent);
                return true;
            case R.id.add_song:
                intent = new Intent(this, my.music.musicdb.UI.CRUD.SongActivity.class);
                this.startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}