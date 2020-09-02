import React from 'react';
import clsx from 'clsx';
import { Route} from 'react-router-dom'
import { makeStyles, useTheme } from '@material-ui/core/styles';
import Drawer from '@material-ui/core/Drawer';
import CssBaseline from '@material-ui/core/CssBaseline';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import List from '@material-ui/core/List';
import Typography from '@material-ui/core/Typography';
import Divider from '@material-ui/core/Divider';
import IconButton from '@material-ui/core/IconButton';
import MenuIcon from '@material-ui/icons/Menu';
import ChevronLeftIcon from '@material-ui/icons/ChevronLeft';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';
import ListItem from '@material-ui/core/ListItem';
import ListItemIcon from '@material-ui/core/ListItemIcon';
import ListItemText from '@material-ui/core/ListItemText';
import InboxIcon from '@material-ui/icons/MoveToInbox';
import MailIcon from '@material-ui/icons/Mail';
import AccountBoxIcon from '@material-ui/icons/AccountBox';
import GroupIcon from '@material-ui/icons/Group';
import BarChartIcon from '@material-ui/icons/BarChart';
import LoyaltyIcon from '@material-ui/icons/Loyalty';
import ArchiveIcon from '@material-ui/icons/Archive';
import QuestionAnswerIcon from '@material-ui/icons/QuestionAnswer';
import './Administrador.css';
import logo from './images/logobici.JPG';
import {ConsultaUser} from './components/consultaUser'
import HistorialUser from './components/historialUser'
import Mensajes from './components/mensajes'
import Estadisticas from './components/estadisticas'
import Ofertas from './components/ofertas'

const drawerWidth = 240;

const useStyles = makeStyles((theme) => ({
  root: {
    display: 'flex',
  },
  appBar: {
    transition: theme.transitions.create(['margin', 'width'], {
      easing: theme.transitions.easing.sharp,
      duration: theme.transitions.duration.leavingScreen,
    }),
  },
  appBarShift: {
    width: `calc(100% - ${drawerWidth}px)`,
    marginLeft: drawerWidth,
    transition: theme.transitions.create(['margin', 'width'], {
      easing: theme.transitions.easing.easeOut,
      duration: theme.transitions.duration.enteringScreen,
    }),
  },
  menuButton: {
    marginRight: theme.spacing(2),
  },
  hide: {
    display: 'none',
  },
  drawer: {
    width: drawerWidth,
    flexShrink: 0,
  },
  drawerPaper: {
    width: drawerWidth,
  },
  drawerHeader: {
    display: 'flex',
    alignItems: 'center',
    padding: theme.spacing(0, 1),
    // necessary for content to be below app bar
    ...theme.mixins.toolbar,
    justifyContent: 'flex-end',
  },
  content: {
    flexGrow: 1,
    padding: theme.spacing(3),
    transition: theme.transitions.create('margin', {
      easing: theme.transitions.easing.sharp,
      duration: theme.transitions.duration.leavingScreen,
    }),
    marginLeft: -drawerWidth,
  },
  contentShift: {
    transition: theme.transitions.create('margin', {
      easing: theme.transitions.easing.easeOut,
      duration: theme.transitions.duration.enteringScreen,
    }),
    marginLeft: 0,
  },
}));


export default function PersistentDrawerLeft() {
  const classes = useStyles();
  const theme = useTheme();
  const [open, setOpen] = React.useState(false);
  const [loginView, setLoginView] = React.useState(<img src={logo} />);


  const handleDrawerOpen = () => {
    setOpen(true);
  };

  const handleDrawerClose = () => {
    setOpen(false);
  };

  const handleClickedUser = ()=>{
    setLoginView(<ConsultaUser/>);
  }
  const handleClickedSta = ()=>{
    setLoginView(<Estadisticas/>);
  }
  const handleClickedOfer = ()=>{
    setLoginView(<Ofertas/>);
  }
  const handleClickedHis = ()=>{
    setLoginView(<HistorialUser/>);
  }
  const handleClickedMs = ()=>{
    setLoginView(<Mensajes/>);
  }

  return (

    <div className={classes.root}>
      <CssBaseline />
      <AppBar
        position="fixed"
        className={clsx(classes.appBar, {
          [classes.appBarShift]: open,
        })}
      >
        <Toolbar>
          <IconButton
            color="inherit"
            aria-label="open drawer"
            onClick={handleDrawerOpen}
            edge="start"
            className={clsx(classes.menuButton, open && classes.hide)}
          >
            <MenuIcon />
          </IconButton>
          <Typography variant="h6" noWrap>
            Menu
          </Typography>
        </Toolbar>
      </AppBar>
      <Drawer
        className={classes.drawer}
        variant="persistent"
        anchor="left"
        open={open}
        classes={{
          paper: classes.drawerPaper,
        }}
      >
        <div className={classes.drawerHeader}>
          <IconButton onClick={handleDrawerClose}>
            {theme.direction === 'ltr' ? <ChevronLeftIcon /> : <ChevronRightIcon />}
          </IconButton>
        </div>
        <Divider />
          <div>
        <AccountBoxIcon className="iconUser"/>
        <Typography variant="h6" noWrap>
            Administrador
          </Typography>
        </div>
        <Divider />
        <List>
            <ListItem button onClick={handleClickedUser}>
              <ListItemIcon><GroupIcon /> </ListItemIcon>
              <ListItemText primary="Consultar usuarios"  />
            </ListItem>
            <ListItem button onClick={handleClickedSta}>
              <ListItemIcon><BarChartIcon /> </ListItemIcon>
              <ListItemText primary="Estadisticas" />
            </ListItem>
            <ListItem button onClick={handleClickedOfer}>
              <ListItemIcon><LoyaltyIcon /> </ListItemIcon>
              <ListItemText primary="Ofertas" />
            </ListItem>
            <ListItem button onClick={handleClickedHis}>
              <ListItemIcon><ArchiveIcon /> </ListItemIcon>
              <ListItemText primary="Historial de usuarios" />
            </ListItem>
            <ListItem button onClick={handleClickedMs}>
              <ListItemIcon><QuestionAnswerIcon /> </ListItemIcon>
              <ListItemText primary="Mensajes y sugerencias" />
            </ListItem>
        </List>
      </Drawer>
      <main
        className={clsx(classes.content, {
          [classes.contentShift]: open,
        })}>
        <div className={classes.drawerHeader} />
        
        {loginView}
      </main>

    </div>
  );
}