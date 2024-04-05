import React, { Component } from 'react';

class Timer extends Component {
    constructor(props) {
        super(props);
        this.state = {
            time: 0,
            isRunning: false
        };
        this.timer = null;
    }

    componentDidMount() {
        console.log("Component mounted");
    }

    componentWillUnmount() {
        console.log("Component unmounted");
        this.stopTimer();
    }

    startTimer = () => {
        this.setState({ isRunning: true });
        this.timer = setInterval(() => {
            this.setState((prevState) => ({
                time: prevState.time + 1
            }));
        }, 1000);
    };

    stopTimer = () => {
        this.setState({ isRunning: false });
        clearInterval(this.timer);
    };

    resetTimer = () => {
        this.setState({ time: 0 });
    };

    render() {
        return (
            <div>
                <h1>Timer: {this.state.time}s</h1>
                <button onClick={this.state.isRunning ? this.stopTimer : this.startTimer}>
                    {this.state.isRunning ? 'Stop' : 'Start'}
                </button>
                <button onClick={this.resetTimer}>Reset</button>
            </div>
        );
    }
}

export default Timer;
