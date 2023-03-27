const [showLastInput, setShowLastInput] = useState(true);

const addSongInput = () => {
  setData({
    ...data,
    songs: [
      ...data.songs,
      { song_title: "", song_lyric: "", song_file: null },
    ],
  });
  setShowLastInput(false);
};

return (
  <div>
    {data.songs.map((song, index) => (
      <div key={index}>
        <input
          type="text"
          value={song.song_title}
          onChange={(e) => setData({
            ...data,
            songs: [
              ...data.songs.slice(0, index),
              { ...song, song_title: e.target.value },
              ...data.songs.slice(index + 1),
            ],
          })}
        />
        <input
          type="text"
          value={song.song_lyric}
          onChange={(e) => setData({
            ...data,
            songs: [
              ...data.songs.slice(0, index),
              { ...song, song_lyric: e.target.value },
              ...data.songs.slice(index + 1),
            ],
          })}
        />
        <input
          type="file"
          onChange={(e) => setData({
            ...data,
            songs: [
              ...data.songs.slice(0, index),
              { ...song, song_file: e.target.files[0] },
              ...data.songs.slice(index + 1),
            ],
          })}
        />
        {showLastInput && index === data.songs.length - 1 && (
          <div>
            <input type="text" placeholder="Add another song title" />
            <input type="text" placeholder="Add another song lyric" />
            <input type="file" placeholder="Add another song file" />
          </div>
        )}
      </div>
    ))}
    <button onClick={addSongInput}>Add</button>
  </div>
);
