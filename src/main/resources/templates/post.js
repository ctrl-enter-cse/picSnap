const postForm = document.getElementById('postForm');

postForm.addEventListener('submit', async (e) => {
    e.preventDefault();

    const caption = document.getElementById('caption').value;
    const image = document.getElementById('image').files[0];

    const formData = new FormData();
    formData.append('caption', caption);
    formData.append('image', image);

    try {
        const token = localStorage.getItem('token');
        const response = await fetch('/api/posts', {
            method: 'POST',
            headers: {
                'Authorization': `Bearer ${token}`
            },
            body: formData
        });

        if (response.ok) {
            alert('Post created successfully!');
            window.location.href = 'feed.html';
        } else {
            const error = await response.json();
            alert(error.message);
        }
    } catch (error) {
        console.error('Error:', error);
        alert('An error occurred while creating the post.');
    }
});