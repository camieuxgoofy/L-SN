export default function SongGroup({ props }) {
    const songData = props.reduce((acc, album) => {
        album.artist_song.forEach((song) => {
            if (song.song_file) {
                acc[song.id] = {
                    title: song.song_title,
                    lyric: song.song_lyric,
                    file: song.song_file,
                    album: album.album_title,
                    artist: album.album_artist_name,
                    art: album.album_art,
                };
            }
        });
        return acc;
    }, {});

    return (
        <div className="song-group">
            {Object.values(songData).map((song) => (
                <div className="song" key={song.id}>
                    <h3>{song.title}</h3>
                    <p>{song.lyric}</p>
                    <p>Album: {song.album}</p>
                    <p>Artist: {song.artist}</p>
                    <img src={song.art} alt={song.album} />
                    <audio src={song.file} controls></audio>
                </div>
            ))}
        </div>
    );
}
