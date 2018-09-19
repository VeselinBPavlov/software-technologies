namespace IMDB.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using System.Collections.Generic;
    using System.Linq;
    using Models;

    public class FilmController : Controller
    {
        private readonly IMDBDbContext dbContext;

        public FilmController(IMDBDbContext dbContext)
        {
            this.dbContext = dbContext;
        }

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            var films = dbContext.Films.ToList();
            return View(films);
        }

        [HttpGet]
        [Route("/create")]
        public ActionResult Create()
        {            
            return View();
        }

        [HttpPost]
        [Route("/create")]
        public ActionResult Create(Film film)
        {
            dbContext.Films.Add(film);
            dbContext.SaveChanges();
            return RedirectToAction(nameof(Index));
        }

        [HttpGet]
        [Route("/edit/{id}")]
        public ActionResult Edit(int? id)
        {
            var movie = dbContext.Films
                .Where(m => m.Id == id)
                .FirstOrDefault();

            return View(movie);            
        }

        [HttpPost]
        [Route("/edit/{id}")]
        public ActionResult EditConfirm(int id, Film film)
        {
            var movie = dbContext.Films
                .Where(m => m.Id == id)
                .FirstOrDefault();

            movie.Name = film.Name;
            movie.Genre = film.Genre;
            movie.Director = film.Director;
            movie.Year = film.Year;

            dbContext.Update(movie);
            dbContext.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        [Route("/delete/{id}")]
        public ActionResult Delete(int? id)
        {
            var movie = dbContext.Films
                .Where(m => m.Id == id)
                .FirstOrDefault();

            return View(movie);
        }

        [HttpPost]
        [Route("/delete/{id}")]
        public ActionResult DeleteConfirm(int id, Film film)
        {
            var movie = dbContext.Films
                .Where(m => m.Id == id)
                .FirstOrDefault();

            dbContext.Films.Remove(movie);
            dbContext.SaveChanges();

            return RedirectToAction("Index");
        }
    }
}
