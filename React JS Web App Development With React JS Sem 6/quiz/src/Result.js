import React from 'react';

const Result = ({ score, questions }) => {
    return (
        <div className="result">
            <h2>You scored {score} out of {questions}!</h2>
            <button onClick={() => window.location.reload()}>Restart Quiz</button>
        </div>
    );
};

export default Result;
