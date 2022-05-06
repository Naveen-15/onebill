import React from "react";
import Profile from "./Components/Profile";
import Education from "./Components/Education";
import { BrowserRouter, Route } from "react-router-dom";
import Projects from "./Components/Projects";
import Experience from "./Components/Experience";
import Extras from "./Components/Extras";
import { Link } from "@material-ui/icons";
function App() {
  return (
    <div>
      <BrowserRouter>
        <div>
          <Link to="/"></Link>
        </div>
        <Route path="/" component={Profile} exact />
        <Route path="/profile" component={Profile} />
        <Route path="/education" component={Education} />
        <Route path="/projects" component={Projects} />
        <Route path="/experience" component={Experience} />
        <Route path="/extras" component={Extras} />
      </BrowserRouter>
    </div>
  );
}

export default App;
