import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import Grid from '@material-ui/core/Grid';

import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Typography from '@material-ui/core/Typography';

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
  },
  paper: {
    padding: theme.spacing(2),
    textAlign: 'center',
    color: theme.palette.text.secondary,
  },
}));

export default function AutoGrid() {
  const classes = useStyles();

  return (
    <div className={classes.root}>
        <Typography variant="h3" noWrap>
            Estadisticas de uso Aplicativo
        </Typography>
      <Grid container spacing={3}>
        <Grid item xs>
          <Paper className={classes.paper}>
          <Card className={classes.root} variant="outlined">
      <CardContent>
        <Typography className={classes.title} color="textSecondary" gutterBottom>
          Oferta 1
        </Typography>
        <Typography variant="h5" component="h2">
            Por el recorrido de 30 kilometros
        </Typography>
        <Typography className={classes.pos} color="textSecondary">
           Recibe un bono de 10 mil pesos
        </Typography>
      </CardContent>
    </Card>
          </Paper>
        </Grid>
        <Grid item xs>
          <Paper className={classes.paper}>
          <Card className={classes.root} variant="outlined">
      <CardContent>
        <Typography className={classes.title} color="textSecondary" gutterBottom>
          Oferta 2
        </Typography>
        <Typography variant="h5" component="h2">
            Por el recorrido de 60 kilometros
        </Typography>
        <Typography className={classes.pos} color="textSecondary">
           Recibe un bono de 20 mil pesos
        </Typography>
      </CardContent>
    </Card>
          </Paper>
        </Grid>
        <Grid item xs>
          <Paper className={classes.paper}>
          <Card className={classes.root} variant="outlined">
      <CardContent>
        <Typography className={classes.title} color="textSecondary" gutterBottom>
          Oferta 3
        </Typography>
        <Typography variant="h5" component="h2">
            Por el recorrido de 90 kilometros
        </Typography>
        <Typography className={classes.pos} color="textSecondary">
           Recibe un bono de 30 mil pesos
        </Typography>
      </CardContent>
    </Card>
          </Paper>
        </Grid>
      </Grid>
    </div>
  );
}