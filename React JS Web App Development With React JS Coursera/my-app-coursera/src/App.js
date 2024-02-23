import Header from "./components/Header";
import Main from "./components/Main";
import Sidebar from "./components/Sidebar";
import "./App.css";

function App() {
  return (
    <div>
      <Header name="Vimal" color="Purple" />
      <Main greet="Yo" />
      <Sidebar greet="Hi" />
    </div>
  );
}

export default App;
