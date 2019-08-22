import axios from "axios";

axios.defaults.params = {
    start: -1,
    end: -1
}
export default axios.create();