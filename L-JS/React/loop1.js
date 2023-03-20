export default function Index({ posts }) {
    return (
        <>
            {posts.map((post) => {
                return (
                    <div key={post.id}>
                        <h2>name: {post.title}</h2>
                    </div>
                );
            })}
        </>
    );
}
// Laravel React JS
