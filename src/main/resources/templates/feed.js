const postContainer = document.getElementById('postContainer');

async function fetchPosts() {
    try {
        const token = localStorage.getItem('token');
        const response = await fetch('/api/posts', {
            headers: {
                'Authorization': `Bearer ${token}`
            }
        });

        if (response.ok) {
            const posts = await response.json();
            displayPosts(posts);
        } else {
            const error = await response.json();
            alert(error.message);
        }
    } catch (error) {
        console.error('Error:', error);
        alert('An error occurred while fetching posts.');
    }
}

function displayPosts(posts) {
    postContainer.innerHTML = '';

    posts.forEach(post => {
        const postElement = document.createElement('div');
        postElement.classList.add('post');

        const imageElement = document.createElement('img');
        imageElement.src = post.imageUrl;
        postElement.appendChild(imageElement);

        const captionElement = document.createElement('p');
        captionElement.classList.add('post-caption');
        captionElement.textContent = post.caption;
        postElement.appendChild(captionElement);

        postContainer.appendChild(postElement);
    });
}

fetchPosts();