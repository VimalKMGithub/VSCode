// import React, { useState, useEffect } from 'react';

// const questions = [
//   {
//     question: 'What is the capital of France?',
//     options: ['Berlin', 'Madrid', 'Paris', 'Rome'],
//     correctAnswer: 'Paris',
//   },
//   {
//     question: 'Which programming language is this app written in?',
//     options: ['Java', 'Python', 'React', 'C++'],
//     correctAnswer: 'React',
//   },
//   // Add more questions as needed
// ];

// const App = () => {
//   const [currentQuestion, setCurrentQuestion] = useState(0);
//   const [score, setScore] = useState(0);
//   const [timeLeft, setTimeLeft] = useState(60); // 60 seconds timer

//   useEffect(() => {
//     const timer = setInterval(() => {
//       setTimeLeft((prevTime) => prevTime - 1);
//     }, 1000);

//     return () => clearInterval(timer);
//   }, []);

//   const handleAnswerClick = (selectedAnswer) => {
//     if (selectedAnswer === questions[currentQuestion].correctAnswer) {
//       setScore((prevScore) => prevScore + 1);
//     }

//     if (currentQuestion < questions.length - 1) {
//       setCurrentQuestion((prevQuestion) => prevQuestion + 1);
//     } else {
//       // Quiz completed
//       alert(`Quiz completed! Your score is ${score}`);
//     }
//   };

//   return (
//     <div className="app">
//       <h1>React Quiz App</h1>
//       <p>Time Left: {timeLeft} seconds</p>
//       <div className="question">
//         <p>{questions[currentQuestion].question}</p>
//         <ul>
//           {questions[currentQuestion].options.map((option, index) => (
//             <li key={index} onClick={() => handleAnswerClick(option)}>
//               {option}
//             </li>
//           ))}
//         </ul>
//       </div>
//     </div>
//   );
// };

// export default App;




import React from 'react';
import Quiz from './Quiz';

const App = () => {
  return (
    <div className="App">
      <h1>React Quiz App</h1>
      <Quiz />
    </div>
  );
};

export default App;