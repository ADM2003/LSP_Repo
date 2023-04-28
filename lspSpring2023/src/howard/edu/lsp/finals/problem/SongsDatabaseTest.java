package howard.edu.lsp.finals.problem;
import org.junit.jupiter.api.DisplayName;

public class SongsDatabaseTest{
	SongsDatabase db = new SongsDatabase();
	
	public void testAddSong() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
	}
	
	public void testGetSongs() {
		Set<String> genreSongs = db.getSongs("Rap");
	}
	
	public void testGetGenreOfSong() {
		System.out.println(db.getGenreOfSong("Savage"));
		System.out.println(db.getGenreOfSong("Always There"));
	}
	
}