import React, { useState } from 'react';

const CourseForm = () => {
    const [courseDetails, setCourseDetails] = useState({
        courseName: '',
        instructor: '',
        description: ''
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setCourseDetails({ ...courseDetails, [name]: value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        // Handle form submission via Google Forms API
        // Example: fetch('GOOGLE_FORMS_SUBMISSION_URL', {
        //   method: 'POST',
        //   body: new FormData(document.getElementById('courseForm'))
        // }).then(response => {
        //   if (response.ok) {
        //     // Handle success
        //   } else {
        //     // Handle error
        //   }
        // });
    };

    return (
        <form id="courseForm" onSubmit={handleSubmit}>
            <label>
                Course Name:
                <input
                    type="text"
                    name="courseName"
                    value={courseDetails.courseName}
                    onChange={handleChange}
                />
            </label>
            <br />
            <label>
                Instructor:
                <input
                    type="text"
                    name="instructor"
                    value={courseDetails.instructor}
                    onChange={handleChange}
                />
            </label>
            <br />
            <label>
                Description:
                <textarea
                    name="description"
                    value={courseDetails.description}
                    onChange={handleChange}
                />
            </label>
            <br />
            <button type="submit">Submit</button>
        </form>
    );
};

export default CourseForm;
