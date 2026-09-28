import {NavLink} from 'react-router-dom';

const TopNavi = () => {
    return (
        <nav>
            <NavLink to="/use-reft1">useRef1</NavLink>&nbsp;
            <NavLink to="/use-reft2">useRef2</NavLink>&nbsp;
            <NavLink to="/use-memo">useMemo</NavLink>&nbsp;
            <NavLink to="/use-callback">useCallback</NavLink>&nbsp;
            <NavLink to="/use-id">useId</NavLink>&nbsp;
    </nav>
    );
}

export default TopNavi;