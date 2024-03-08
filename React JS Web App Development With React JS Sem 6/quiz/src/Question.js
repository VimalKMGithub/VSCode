import React from 'react';

const Question = ({ question, answers, selectedAnswer, onAnswerSelect }) => {
    return (
        <div className="question">
            <h3>{question}</h3>
            <ul>
                {answers.map((answer, index) => (
                    <li key={index}>
                        <input
                            type="radio"
                            id={`answer-${index}`}
                            name="answer"
                            value={index}
                            checked={selectedAnswer === index}
                            onChange={() => onAnswerSelect(index)}
                        />
                        <label htmlFor={`answer-${index}`}>{answer.answer}</label>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default Question;
