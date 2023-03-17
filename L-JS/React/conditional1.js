 const user = usePage().props.auth.user;
    if (user) {
        return (
            <>
                {user.role === "fan" ? (
                    <>
                        <h1>fan page</h1>
                        <h2>name : {user.name}</h2>
                    </>
                ) : (
                    <>
                        <h1>artist page</h1>
                        <h2>name : {user.name}</h2>
                    </>
                )}
            </>
        );
    }
    return (
        <>
            <h1>Guest Page</h1>
        </>
    );
