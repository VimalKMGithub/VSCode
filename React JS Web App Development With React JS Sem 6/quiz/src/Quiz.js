import React, { useState, useEffect } from 'react';
import Question from './Question';
import Result from './Result';
import { questions } from './data';

const Quiz = () => {
    const [currentQuestion, setCurrentQuestion] = useState(0);
    const [selectedAnswer, setSelectedAnswer] = useState(null);
    const [score, setScore] = useState(0);
    const [time, setTime] = useState(30); // Adjust timer duration (seconds)
    const [isSubmitted, setIsSubmitted] = useState(false);

    useEffect(() => {
        const timerId = setInterval(() => {
            if (time > 0 && !isSubmitted) {
                setTime(prevTime => prevTime - 1);
            } else if (time === 0 && !isSubmitted) {
                handleNextQuestion();
            }
        }, 1000);
        return () => clearInterval(timerId);
    }, [time, currentQuestion, isSubmitted]);

    const handleAnswerSelect = (answer) => {
        setSelectedAnswer(answer);
    };

    const handleNextQuestion = () => {
        if (isSubmitted) return; // Prevent multiple submissions

        const isCorrect = questions[currentQuestion].answers[selectedAnswer].correct;
        if (isCorrect) setScore(score + 1);
        setCurrentQuestion(prevQuestion => prevQuestion + 1);
        setSelectedAnswer(null);
        setTime(30); // Reset timer for next question
    };

    const handleSubmit = () => {
        setIsSubmitted(true);
    };

    // Check if there are questions defined and handle the error
    if (!questions.length) {
        return <div>No questions defined!</div>;
    }

    return (
        <div className="quiz">
            {isSubmitted ? (
                <Result score={score} questions={questions.length} />
            ) : (
                <>
                    <div className="timer">Time: {time} seconds</div>
                    {/* Conditionally render Question component only if within questions length */}
                    {currentQuestion < questions.length && (
                        <Question
                            question={questions[currentQuestion].question}
                            answers={questions[currentQuestion].answers}
                            selectedAnswer={selectedAnswer}
                            onAnswerSelect={handleAnswerSelect}
                        />
                    )}
                    <button disabled={isSubmitted} onClick={handleNextQuestion}>
                        {currentQuestion === questions.length - 1 ? "Submit Quiz" : "Next Question"}
                    </button>
                </>
            )}
        </div>
    );
};

export default Quiz;
