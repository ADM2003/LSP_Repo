package howard.edu.lsp.finals.problem;
import java.util.Set;

public class SongsDatabaseTest{
	SongsDatabase db = new SongsDatabase();
	
	public void testAddSong() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
	}
	
	public void testGetSongs() {
		Set<String> genreSongs = db.getSongs("Rap");
		System.out.println(genreSongs);
	}
	
	public void testGetGenreOfSong() {
		System.out.println(db.getGenreOfSong("Savage"));
		System.out.println(db.getGenreOfSong("Always There"));
	}
	
}