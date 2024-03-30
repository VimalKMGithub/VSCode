import React, { Component } from 'react';

class Timer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      time: 0,
      isRunning: false
    };
    this.timerInterval = null;
  }

  componentDidMount() {
    console.log('Timer mounted');
  }

  componentDidUpdate() {
    console.log('Timer updated');
  }

  componentWillUnmount() {
    console.log('Timer unmounted');
    this.stopTimer();
  }

  startTimer = () => {
    this.setState({ isRunning: true });
    this.timerInterval = setInterval(() => {
      this.setState((prevState) => ({
        time: prevState.time + 1
      }));
    }, 1000);
  };

  stopTimer = () => {
    this.setState({ isRunning: false });
    clearInterval(this.timerInterval);
  };

  resetTimer = () => {
    this.setState({ time: 0 });
  };

  render() {
    return (
      <div>
        <h1>Timer: {this.state.time}</h1>
        <button onClick={this.state.isRunning ? this.stopTimer : this.startTimer}>
          {this.state.isRunning ? 'Pause' : 'Start'}
        </button>
        <button onClick={this.resetTimer}>Reset</button>
      </div>
    );
  }
}

class App extends Component {
  render() {
    return (
      <div>
        <h1>Interactive Timer App</h1>
        <Timer />
      </div>
    );
  }
}

export default App;
