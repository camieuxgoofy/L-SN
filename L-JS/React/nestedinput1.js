<form onSubmit={handleSubmit}>
  <label>
    Album Title:
    <input type="text" name="album_title" value={album.title} onChange={handleAlbumTitleChange} />
  </label>
  <label>
    Album Artist:
    <input type="text" name="album_artist" value={album.artist} onChange={handleAlbumArtistChange} />
  </label>
  <br />
  {musics.map((music, index) => (
    <div key={index}>
      <label>
        Music Title:
        <input type="text" name={`musics[${index}][title]`} value={music.title} onChange={handleMusicTitleChange(index)} />
      </label>
      <label>
        Music File:
        <input type="file" name={`musics[${index}][file]`} onChange={handleMusicFileChange(index)} />
      </label>
    </div>
  ))}
  <button type="button" onClick={handleAddMusic}>Add Music</button>
  <button type="submit">Save</button>
</form>
