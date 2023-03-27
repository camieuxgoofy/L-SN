const [lastIndex, setLastIndex] = useState(0);

const addSongInput = () => {
  const newLastIndex = lastIndex + 1;
  const newSong = { song_title: "", song_lyric: "", song_file: null };
  setData((prevState) => ({
    ...prevState,
    songs: [...prevState.songs.slice(0, newLastIndex), newSong],
  }));
  setLastIndex(newLastIndex);
};

return (
  <div>
    {data.songs.map((song, i) => (
      <div key={i} style={{ display: i === lastIndex ? "block" : "none" }}>
        <input
          type="text"
          value={song.song_title}
          onChange={(e) =>
            setData((prevState) => ({
              ...prevState,
              songs: [
                ...prevState.songs.slice(0, i),
                { ...prevState.songs[i], song_title: e.target.value },
                ...prevState.songs.slice(i + 1),
              ],
            }))
          }
        />
        <input
          type="text"
          value={song.song_lyric}
          onChange={(e) =>
            setData((prevState) => ({
              ...prevState,
              songs: [
                ...prevState.songs.slice(0, i),
                { ...prevState.songs[i], song_lyric: e.target.value },
                ...prevState.songs.slice(i + 1),
              ],
            }))
          }
        />
        <input
          type="file"
          onChange={(e) =>
            setData((prevState) => ({
              ...prevState,
              songs: [
                ...prevState.songs.slice(0, i),
                { ...prevState.songs[i], song_file: e.target.files[0] },
                ...prevState.songs.slice(i + 1),
              ],
            }))
          }
        />
      </div>
    ))}
    <button onClick={addSongInput}>Add</button>
  </div>
);
