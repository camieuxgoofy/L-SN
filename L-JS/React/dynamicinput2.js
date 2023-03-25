import { useState } from "react";

export default function Test() {
    const [albumData, setAlbumData] = useState({
        title: "",
        artist: "",
        musics: [{ title: "", length: "", file: null }],
    });

    const handleInputChange = (event) => {
        const { name, value } = event.target;
        setAlbumData({ ...albumData, [name]: value });
    };

    const handleMusicInputChange = (event, index) => {
        const { name, value } = event.target;
        const musics = [...albumData.musics];
        musics[index][name] = value;
        setAlbumData({ ...albumData, musics });
    };

    const handleMusicFileChange = (event, index) => {
        const file = event.target.files[0];
        const musics = [...albumData.musics];
        musics[index].file = file;
        setAlbumData({ ...albumData, musics });
    };

    const addMusicInput = () => {
        setAlbumData({
            ...albumData,
            musics: [
                ...albumData.musics,
                { title: "", length: "", file: null },
            ],
        });
    };

    const removeMusicInput = (index) => {
        const musics = [...albumData.musics];
        musics.splice(index, 1);
        setAlbumData({ ...albumData, musics });
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        // Submit form data using Axios or any other library
        console.log(albumData);
    };

    return (
        <form onSubmit={handleSubmit}>
            <div>
                <label htmlFor="title">Album Title</label>
                <input
                    type="text"
                    name="title"
                    id="title"
                    value={albumData.title}
                    onChange={handleInputChange}
                />
            </div>

            <div>
                <label htmlFor="artist">Album Artist</label>
                <input
                    type="text"
                    name="artist"
                    id="artist"
                    value={albumData.artist}
                    onChange={handleInputChange}
                />
            </div>

            <div id="musics_container">
                {albumData.musics.map((music, index) => (
                    <div className="music" key={index}>
                        <label htmlFor={`music_title_${index}`}>
                            Music Title
                        </label>
                        <input
                            type="text"
                            name="title"
                            id={`music_title_${index}`}
                            value={music.title}
                            onChange={(event) =>
                                handleMusicInputChange(event, index)
                            }
                        />

                        <label htmlFor={`music_length_${index}`}>
                            Music Length
                        </label>
                        <input
                            type="text"
                            name="length"
                            id={`music_length_${index}`}
                            value={music.length}
                            onChange={(event) =>
                                handleMusicInputChange(event, index)
                            }
                        />

                        <label htmlFor={`music_file_${index}`}>
                            Music File
                        </label>
                        <input
                            type="file"
                            name="file"
                            id={`music_file_${index}`}
                            onChange={(event) =>
                                handleMusicFileChange(event, index)
                            }
                        />

                        <button
                            type="button"
                            onClick={() => removeMusicInput(index)}
                        >
                            Remove
                        </button>
                    </div>
                ))}
            </div>

            <button type="button" onClick={addMusicInput}>
                Add Music
            </button>
            <button type="submit">Submit</button>
        </form>
    );
}
