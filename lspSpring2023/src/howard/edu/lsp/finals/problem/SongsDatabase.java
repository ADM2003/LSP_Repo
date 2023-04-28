package howard.edu.lsp.finals.problem;
import java.util.*;

public class SongsDatabase{
	
	private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
	
	public void addSong(String genre, String songTitle) {
		HashSet<String> genreSongs = map.getOrDefault(genre, new HashSet<String>());
		genreSongs.add(songTitle);
		map.put(genre, genreSongs);
	}
	
	public Set<String> getSongs(String genre){
		return map.getOrDefault(genre,  new HashSet<String>());
	}
	
	public String getGenreOfSong(String songTitle) {
		String genreOfSong = "";
		for (String genre : map.keySet()) {
			if(map.get(genre).contains(songTitle)) {
				genreOfSong = genre;
				return genreOfSong;
			}
		}
		String noSongTitle = "This set does not contain this song.";
		return noSongTitle;
	}
	
}
